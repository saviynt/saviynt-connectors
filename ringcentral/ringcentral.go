package ringcentral

import saviyntconnectors "github.com/grokify/saviynt-connectors"

func ObjectSummary() saviyntconnectors.ObjectSummary {
	return saviyntconnectors.ObjectSummary{
		Objects: saviyntconnectors.Objects{
			Connection: []string{"RingCentral"},
		},
		Information: saviyntconnectors.ObjectSummaryInformation{
			GUID:           "eef8d967-386b-4834-b2a8-2eaa624302fb",
			ExportedBy:     "admin",
			ExportedOn:     "2023-07-26 07:08:44",
			System:         "scrum-exchange.saviyntcloud.com",
			TransferOwners: "0",
			TransferUsers:  "0",
		},
	}

}
