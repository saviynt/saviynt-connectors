package ringcentral

import (
	"net/http"

	saviyntconnectors "github.com/grokify/saviynt-connectors"
)

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

func Connection() saviyntconnectors.ConnectionMap {
	ra := saviyntconnectors.RequestsAttribute{
		Name: "CreateAccountJSON",
		Requests: saviyntconnectors.Requests{
			AccountIdPath: "call1.message.id",
			ResponseColsToPropsMap: map[string]string{
				"name": "call1.message.userName~#~char",
			},
			Calls: []saviyntconnectors.Call{
				{
					Name:       "call1",
					Connection: "acctAuth",
					URL:        "https://platform.devtest.ringcentral.com/scim/v2/Users",
					HTTPMethod: http.MethodPost,
					HTTPParams: "{\"active\":true,\"name\":{\"familyName\":\"${user.lastname}\",\"givenName\":\"${user.firstname}\"},\"emails\":[{\"type\":\"work\",\"value\":\"${user.email}\"}],\"schemas\":[\"urn:ietf:params:scim:schemas:core:2.0:User\"],\"userName\":\"${user.username}\"}",
					HTTPHeaders: map[string]string{
						"authorization": "${access_token}",
						"Accept":        "application/json",
					},
					HTTPContentType: "application/json",
					SuccessResponses: saviyntconnectors.Responses{
						StatusCodes: []uint{200, 201},
					},
				},
			},
		},
	}
	ea, err := ra.ExtendedAttr()
	if err != nil {
		panic(err)
	}

	extAttrs := saviyntconnectors.ExternalAttrs{
		{
			AttributeName:           "ConnectionJSON",
			EncryptedAttributeValue: "F094T0v6WHOpHcSzOqzN/G0EOXMVamwB8u2E9ttQNJNH/uqcgtvsw9t4/JqDJeCqQsdihkRCJpZn9bLHAwEt1khfhJ57qiyRImlt7xYaAw8R3gKwlb5P5Pls/NpXrJCJEOIIKBqZmra7c/8I5jIPpwDMQA72hCb7+NjiIMbsrgAdpeFAoP6/433ACaPmQ86SoWaZO2mA0+TKvsTYHtVp6K9yHo/Z1fKuWU+vJl7Lxa32+Kz/u5eUMFbVq8zOMQr90/02BPk1s1lKjq1MxsJ7FL18zFq3rzaC2M0icHhhGcz804Dz7klQFnwn58kFix0ThAV8SuLnAi8W4nCINNWsbdbnJomLGY2IQzoogWU7i8lvx1a5VS38MNppSyGQaXnHgO7sdnGs7JHDenJ1Hh25Dz8C1uMfEs7aonK83W+hdAQIi2usFnc5i5z1+9pmhbhkkfQAIuEECtSBCuDyIiOVkpthljbmF+IiIIyYgfSfnv91wCLSwL6NUH/kqcuI870Rwc/WV6bFGGJT3NYaPlf1gvNAfLfBkfrV/eGDAnZX33jK9+vfJDTfYnOgjVztRS21Tr1w3FJNogJjZuRclkjk0ZjoUHZOu9cpoah88ByFN6idLJN51r4kSAMoz+RxnsdfHSuuZKsk3AJmpldcy4QLKV+JnLVy24OSJZC9t4tTfWdKhJUibFN0A3qHMM+o3xhehOeaKooW1q3+FdbZLieB4Q==",
		},
		ea,
		{
			AttributeName:           "DisableAccountJSON",
			EncryptedAttributeValue: "{\r\n  \"call\": [\r\n    {\r\n      \"name\": \"call1\",\r\n      \"connection\": \"acctAuth\",\r\n      \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users/${account.accountID}\",\r\n      \"httpMethod\": \"PATCH\",\r\n      \"httpParams\": \"{\\\"schemas\\\":[\\\"urn:ietf:params:scim:api:messages:2.0:PatchOp\\\"],\\\"Operations\\\":[{\\\"op\\\":\\\"replace\\\",\\\"path\\\":\\\"active\\\",\\\"value\\\":\\\"false\\\"}]}\",\r\n      \"httpHeaders\": {\r\n        \"authorization\": \"${access_token}\",\r\n        \"Accept\": \"application/json\"\r\n      },\r\n      \"httpContentType\": \"application/json\",\r\n      \"successResponses\": {\r\n        \"statusCode\": [\r\n          200,\r\n          201\r\n        ]\r\n      }\r\n    }\r\n  ]\r\n}",
		},
		{
			AttributeName:           "EnableAccountJSON",
			EncryptedAttributeValue: "{\r\n  \"call\": [\r\n    {\r\n      \"name\": \"call1\",\r\n      \"connection\": \"acctAuth\",\r\n      \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users/${account.accountID}\",\r\n      \"httpMethod\": \"PATCH\",\r\n      \"httpParams\": \"{\\\"schemas\\\":[\\\"urn:ietf:params:scim:api:messages:2.0:PatchOp\\\"],\\\"Operations\\\":[{\\\"op\\\":\\\"replace\\\",\\\"path\\\":\\\"active\\\",\\\"value\\\":\\\"true\\\"}]}\",\r\n      \"httpHeaders\": {\r\n        \"authorization\": \"${access_token}\",\r\n        \"Accept\": \"application/json\"\r\n      },\r\n      \"httpContentType\": \"application/json\",\r\n      \"successResponses\": {\r\n        \"statusCode\": [\r\n          200,\r\n          201\r\n        ]\r\n      }\r\n    }\r\n  ]\r\n}",
		},
		{
			AttributeName:           "ImportAccountEntJSON",
			EncryptedAttributeValue: "{\r\n  \"accountParams\": {\r\n    \"connection\": \"acctAuth\",\r\n    \"processingType\": \"SequentialAndIterative\",\r\n    \"statusAndThresholdConfig\": {\r\n      \"statusColumn\": \"customproperty10\",\r\n      \"active\": [\r\n        \"true\"\r\n      ],\r\n      \"deleteLinks\": true,\r\n      \"accountThresholdValue\": 1000,\r\n      \"correlateInactiveAccounts\": false,\r\n      \"inactivateAccountsNotInFile\": true,\r\n      \"deleteAccEntForActiveAccounts\": true\r\n    },\r\n    \"call\": {\r\n      \"call1\": {\r\n        \"callOrder\": 0,\r\n        \"stageNumber\": 0,\r\n        \"http\": {\r\n          \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users?filter=&startIndex=1&count=3\",\r\n          \"httpHeaders\": {\r\n            \"authorization\": \"${access_token}\",\r\n            \"Accept\": \"application/json\"\r\n          },\r\n          \"httpContentType\": \"application/json\",\r\n          \"httpMethod\": \"GET\"\r\n        },\r\n        \"listField\": \"Resources\",\r\n        \"keyField\": \"accountID\",\r\n        \"colsToPropsMap\": {\r\n          \"accountID\": \"id~#~char\",\r\n          \"name\": \"userName~#~char\",\r\n          \"displayName\": \"emails.value~#~char\",\r\n          \"customproperty1\": \"name.familyName~#~char\",\r\n          \"customproperty2\": \"name.givenName~#~char\",\r\n          \"customproperty3\": \"meta.resourceType~#~char\",\r\n          \"customproperty4\": \"meta.created~#~char\",\r\n          \"customproperty5\": \"meta.lastModified~#~char\",\r\n          \"customproperty6\": \"meta.location~#~char\",\r\n          \"customproperty7\": \"schemas~#~char\",\r\n          \"customproperty8\": \"emails.type~#~char\",\r\n          \"customproperty9\": \"emails.value~#~char\",\r\n          \"customproperty10\": \"active~#~char\",\r\n          \"customproperty11\": \"addresses.streetAddress~#~char\",\r\n          \"customproperty12\": \"addresses.locality~#~char\",\r\n          \"customproperty13\": \"addresses.region~#~char\",\r\n          \"customproperty14\": \"addresses.postalCode~#~char\",\r\n          \"customproperty15\": \"addresses.country~#~char\",\r\n          \"customproperty16\": \"addresses.type~#~char\",\r\n          \"customproperty17\": \"phoneNumbers.value~#~char\",\r\n          \"customproperty18\": \"phoneNumbers.type~#~char\"\r\n        }\r\n      }\r\n    },\r\n    \"page\": {\r\n      \"pageSizeParam\": \"count\",\r\n      \"pageSize\": 20,\r\n      \"pageRecordCount\": \"itemsPerPage\",\r\n      \"pageNumberParam\": \"page\",\r\n      \"totalCountPath\": \"completeResponseMap.meta.totalResults\",\r\n      \"firstPageNumber\": 1\r\n    }\r\n  }\r\n}",
		},
		{
			AttributeName:           "RemoveAccountJSON",
			EncryptedAttributeValue: "{\r\n  \"call\": [\r\n    {\r\n      \"name\": \"call1\",\r\n      \"connection\": \"acctAuth\",\r\n      \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users/${account.accountID}\",\r\n      \"httpMethod\": \"DELETE\",\r\n      \"httpHeaders\": {\r\n        \"Authorization\": \"${access_token}\",\r\n        \"Accept\": \"application/json\"\r\n      },\r\n      \"httpContentType\": \"application/json\",\r\n      \"successResponses\": {\r\n        \"statusCode\": [\r\n          200,\r\n          201,\r\n          204\r\n        ]\r\n      }\r\n    }\r\n  ]\r\n}",
		},
		{
			AttributeName:           "UpdateAccountJSON",
			EncryptedAttributeValue: "{\r\n  \"call\": [\r\n    {\r\n      \"name\": \"call1\",\r\n      \"connection\": \"acctAuth\",\r\n      \"url\": \"https://platform.devtest.ringcentral.com/scim/v2/Users/${account.accountID}\",\r\n      \"httpMethod\": \"PUT\",\r\n      \"httpParams\": \"{\\\"active\\\":true,\\\"name\\\":{\\\"familyName\\\":\\\"${user.lastname}\\\",\\\"givenName\\\":\\\"${user.firstname}\\\"},\\\"emails\\\":[{\\\"type\\\":\\\"work\\\",\\\"value\\\":\\\"${user.email}\\\"}],\\\"schemas\\\":[\\\"urn:ietf:params:scim:schemas:core:2.0:User\\\"],\\\"userName\\\":\\\"${user.username}\\\"}\",\r\n      \"httpHeaders\": {\r\n        \"authorization\": \"${access_token}\",\r\n        \"Accept\": \"application/json\"\r\n      },\r\n      \"httpContentType\": \"application/json\",\r\n      \"successResponses\": {\r\n        \"statusCode\": [\r\n          200,\r\n          201\r\n        ]\r\n      }\r\n    }\r\n  ]\r\n}",
		},
	}
	return saviyntconnectors.ConnectionMap{
		"RingCentral": saviyntconnectors.Connection{
			ConnectionDescription:  "RingCentral",
			ConnectionName:         "RingCentral",
			Connectorms:            false,
			ExternalConnectionType: "REST",
			Status:                 1,
			StatusForEnableDisable: 1,
			TemplateMandatoryData:  "DwitEostW3Z60d/A6Ua4sw==",
			TemplateName:           "Ringcentral",
			ExternalAttrs:          extAttrs.Inflate(),
		},
	}
}
