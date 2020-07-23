# QuarkusHack

1.Use case desription is provided as part of submission.
2.More details are provide here on the API and code.
3.There is an API which is used by the dealer to get the secret activation code of the delivered items from the Firms[Manufacturer] server. [Server app is Quarkus serverless app.]
4.API : 
 Details of API: 
 API structure: https://<SERVER-IP>:PORT/orfer/secret/{id}
 id structure: <OTP>_<YubikeyGeneratedCode>. For simplicity OTP is just a single digit in the repo code.
 OTP Validation is done. In repo code only length validatio is just and not the actual mobile SMS otp validation for simplicity.
 Json Response structure: It will have the basic order details and a key-value structure named as "items" which has itemCode-secretCode pairs required for activation.
 
