var axios = require('axios');
var data = '<?xml version="1.0" encoding="utf-8"?>\r\n                <soapenv:Envelope \r\n                    xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">\r\n                    <soapenv:Body xmlns:tns="http://Soap/">\r\n                        <tns:mult>\r\n                            <a>12</a>\r\n                            <b>1</b>\r\n                        </tns:mult>\r\n                    </soapenv:Body>\r\n                </soapenv:Envelope>';

var config = {
  method: 'post',
  url: 'http://localhost:5050/',
  headers: { 
    'Content-Type': 'text/xml'
  },
  data : data
};

axios(config)
.then(function (response) {
  console.log(JSON.stringify(response.data));
})
.catch(function (error) {
  console.log(error);
});
