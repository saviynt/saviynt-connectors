package saviyntconnectors

type ConnectionMap map[string]Connection

type Connection struct {
	ConnectionDescription     string         `json:"connectiondescription"`
	ConnectionName            string         `json:"connectionname"`
	Connectorms               bool           `json:"connectorms"`
	ConnectorType             *string        `json:"connectorType"`
	CredentialChangeConfig    *string        `json:"credentialChangeConfig"`
	ExternalConnectionType    string         `json:"externalconnectiontype"`
	MSConnectorVersion        *string        `json:"msconnectorversion"`
	SSLCertificate            *string        `json:"sslCertificate"`
	SSLCertificateID          *string        `json:"sslCertificateId"`
	Status                    int            `json:"status"`
	StatusForEnableDisable    int            `json:"statusForEnableDisable"`
	TemplateMandatoryData     string         `json:"templateMandatoryData"`
	TemplateName              string         `json:"templateName"`
	VaultConfig               *string        `json:"vaultConfig"`
	VaultCredentialConnection *string        `json:"vaultCredentialConnection"`
	ExternalAttrs             []ExternalAttr `json:"EXTERNAL_ATTR"`
}

type ExternalAttr struct {
	AttributeName           string  `json:"attributename"`
	CredentialSaveStatus    bool    `json:"credentialSaveStatus"`
	Encryptedattributevalue string  `json:"encryptedattributevalue"`
	Formdata                *string `json:"formdata"`
}
