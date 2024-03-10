package saviyntconnectors

import (
	"sort"
	"strings"

	"github.com/grokify/mogo/encoding/jsonutil"
	"github.com/grokify/mogo/type/maputil"
	"github.com/grokify/mogo/type/slicesutil"
)

type ConnectionMap map[string]Connection

func (cm ConnectionMap) Names() []string {
	return maputil.Keys(cm)
}

func ConnectionMapReadFile(filename string) (*ConnectionMap, error) {
	connMap := &ConnectionMap{}
	_, err := jsonutil.UnmarshalFile(filename, connMap)
	return connMap, err
}

type Connection struct {
	ConnectionKey             string        `json:"_connectionKey"`
	ConnectionDescription     string        `json:"connectiondescription"`
	ConnectionName            string        `json:"connectionname"`
	Connectorms               bool          `json:"connectorms"`
	ConnectorType             *string       `json:"connectorType"`
	CredentialChangeConfig    *string       `json:"credentialChangeConfig"`
	ExternalConnectionType    string        `json:"externalconnectiontype"`
	MSConnectorVersion        *string       `json:"msconnectorversion"`
	SSLCertificate            *string       `json:"sslCertificate"`
	SSLCertificateID          *string       `json:"sslCertificateId"`
	Status                    int           `json:"status"`
	StatusForEnableDisable    int           `json:"statusForEnableDisable"`
	TemplateMandatoryData     string        `json:"templateMandatoryData"`
	TemplateName              string        `json:"templateName"`
	VaultConfig               *string       `json:"vaultConfig"`
	VaultCredentialConnection *string       `json:"vaultCredentialConnection"`
	ExternalAttrs             ExternalAttrs `json:"EXTERNAL_ATTR"`
}

type ExternalAttrs []ExternalAttr

func (e ExternalAttrs) Inflate() ExternalAttrs {
	inflated := ExternalAttrs{}
	namesMap := map[string]int{}
	for _, ea := range e {
		inflated = append(inflated, ea)
		namesMap[ea.AttributeName]++
	}
	allNames := ExternalAttributeNames()
	for _, extraName := range allNames {
		if _, ok := namesMap[extraName]; !ok {
			inflated = append(inflated, ExternalAttr{
				AttributeName: extraName,
			})
		}
	}
	return inflated
}

func (e ExternalAttrs) Names(uppercaseNames, dedupeNames, sortNames, requireValue bool) []string {
	var names []string
	for _, ea := range e {
		name := ea.AttributeName
		name = strings.TrimSpace(name)
		if uppercaseNames {
			name = strings.ToUpper(name)
		}
		if requireValue {
			if v := strings.TrimSpace(ea.EncryptedAttributeValue); v == "" {
				continue
			}
		}
		if name != "" {
			names = append(names, name)
		}
	}
	if dedupeNames {
		names = slicesutil.Dedupe(names)
	}
	if sortNames {
		sort.Strings(names)
	}
	return names
}

type ExternalAttr struct {
	AttributeName           string  `json:"attributename"`
	CredentialSaveStatus    bool    `json:"credentialSaveStatus"`
	EncryptedAttributeValue string  `json:"encryptedattributevalue"`
	Formdata                *string `json:"formdata"`
}

func ExternalAttributeNames() []string {
	return []string{
		"AddAccessJSON",
		"AddFFIDAccessJSON",
		"ChangePassJSON",
		"ConfigJSON",
		"ConnectionJSON",
		"CreateAccountJSON",
		"CreateTicketJSON",
		"DisableAccountJSON",
		"EnableAccountJSON",
		"ImportAccountEntJSON",
		"ImportUserJSON",
		"PasswdPolicyJSON",
		"RemoveAccessJSON",
		"RemoveAccountJSON",
		"RemoveFFIDAccessJSON",
		"SendOtpJSON",
		"TicketStatusJSON",
		"UpdateAccountJSON",
		"UpdateUserJSON",
		"ValidateOtpJSON",
		"ENDPOINTS_FILTER",
		"MODIFYUSERDATAJSON",
		"PAM_CONFIG",
		"STATUS_THRESHOLD_CONFIG",
	}
}
