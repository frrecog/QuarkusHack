# QuarkusHack

1.Use case desription is provided as part of submission.  <br/>
2.More details are provide here on the API and code.  <br/>
3.There is an API which is used by the dealer to get the secret activation code of the delivered items from the Firms *[Manufacturer]* server. *[Server app is Quarkus serverless app.]*    <br/>
4.**API :** <br/>
 **4.1 Details of API:** <br/>
 **4.2 API structure:** https://<SERVER-IP>:PORT/orfer/secret/{id}  <br/>
 **4.3 id structure:** <OTP>_<YubikeyGeneratedCode>. For simplicity OTP is just a single digit in the repo code. OTP Validation is done. In repo code only length validatio is just and not the actual mobile SMS otp validation for simplicity.<br/>
 **4.4 Json Response structure:** It will have the basic order details and a key-value structure named as "items" which has itemCode-secretCode pairs required for activation.<br/>
 
