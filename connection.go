package saviyntconnectors

import "sort"

type ConnectionMap map[string]Connection

type Connection struct {
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

func (e ExternalAttrs) Names(sortNames bool) []string {
	var names []string
	for _, ea := range e {
		names = append(names, ea.AttributeName)
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
