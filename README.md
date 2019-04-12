# payment-service
Spring microservice

## GET
curl -X GET \
  http://localhost:9091/payments/1 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: baae12cc-6dda-8304-1f55-a89cb8af01d3'
  
## POST
curl -X POST \
  http://localhost:9091/payments \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 0cdd711b-a4a0-1b70-6a94-30a2fa0debdc' \
  -d '{
    "id": 2,
    "cardNumber": "1234 5432 9997 9999",
    "expiringDate": "22/1987",
    "purchaseValue": 123.43000000000000682121026329696178436279296875,
    "cardFlag": "MasterCard"
}'

## PUT
curl -X PUT \
  http://localhost:9091/payments \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 9420ac82-425e-35f7-da7d-8dc2350ddeb2' \
  -d '{
    "id": 2,
    "cardNumber": "4321 5432 9997 9999",
    "expiringDate": "21/1999",
    "purchaseValue": 123.43000000000000682121026329696178436279296875,
    "cardFlag": "Elo"
}'

## DELETE
curl -X DELETE \
  http://localhost:9091/payments/2 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 2809401a-5c6d-3440-996b-38a8b50f6ca7'
