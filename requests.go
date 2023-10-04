package saviyntconnectors

import "encoding/json"

type RequestsAttribute struct {
	Name     string
	Requests Requests
}

func (ra RequestsAttribute) ExtendedAttr() (ExternalAttr, error) {
	encrypted, err := ra.Requests.String()
	if err != nil {
		return ExternalAttr{}, err
	}
	ea := ExternalAttr{
		AttributeName:           ra.Name,
		EncryptedAttributeValue: encrypted,
	}
	return ea, nil
}

type Requests struct {
	AccountIdPath          string            `json:"accountIdPath"`
	ResponseColsToPropsMap map[string]string `json:"responseColsToPropsMap"`
	Calls                  []Call            `json:"call"`
}

func (r Requests) Bytes() ([]byte, error) {
	return json.Marshal(r)
}

func (r Requests) String() (string, error) {
	b, err := r.Bytes()
	if err != nil {
		return "", err
	}
	return string(b), nil
}

func (r Requests) MustString() string {
	s, err := r.String()
	if err != nil {
		panic(err)
	}
	return s
}

type Call struct {
	Connection       string            `json:"connection"`
	HTTPContentType  string            `json:"httpContentType"`
	HTTPHeaders      map[string]string `json:"httpHeaders"`
	HTTPMethod       string            `json:"httpMethod"`
	HTTPParams       string            `json:"httpParams"`
	Name             string            `json:"name"`
	URL              string            `json:"url"`
	SuccessResponses Responses         `json:"successResponses"`
}

type Responses struct {
	StatusCodes []uint `json:"statusCode"`
}
