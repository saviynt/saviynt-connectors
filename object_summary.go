package saviyntconnectors

type ObjectSummary struct {
	Objects     Objects                  `json:"Objects"`
	Information ObjectSummaryInformation `json:"Information"`
}

type Objects struct {
	Connection []string `json:"Connection"`
}

type ObjectSummaryInformation struct {
	GUID           string `json:"GUID"`
	ExportedBy     string `json:"Exported By"`
	ExportedOn     string `json:"Exported On"`
	System         string `json:"System"`
	TransferOwners string `json:"TransferOwners"`
	TransferUsers  string `json:"TransferUsers"`
}
