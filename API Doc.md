# Project: SM
# 📁 Collection: account 


## End-point: Create User
### Method: POST
>```
>localhost:8081/v1/account
>```
### Body (**raw**)

```json
{
    "name": "halo",
    "email": "halo",
    "role": "ADMIN",
    "password": "halo",
    "username": "halo"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "OK"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Update User
### Method: PUT
>```
>localhost:8081/v1/account/:id
>```
### Body (**raw**)

```json
{
    "name": "halo halo"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Account Updated"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Account List
### Method: GET
>```
>http://localhost:8081/v1/account
>```
### Response: 200
```json
{
    "success": true,
    "data": [
        {
            "id": "a218b38f-3a61-4799-a9ca-7d3a973c4d75",
            "name": "halo",
            "email": "halo",
            "role": "ADMIN",
            "username": "halo"
        },
        {
            "id": "a6e9e524-6666-4ea4-be6d-8d6b50c8a88a",
            "name": "halo halo",
            "email": "halo",
            "role": "ADMIN",
            "username": "halo"
        }
    ]
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Delete Account
### Method: DELETE
>```
>http://localhost:8081/v1/account/:id
>```
### Response: 200
```json
{
    "success": true,
    "data": "Account Deleted"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: farmer 


## End-point: Create Farmer
### Method: POST
>```
>http://localhost:8081/v1/farmer
>```
### Body (**raw**)

```json
{
    "name":"asd",
    "bod":"2020-04-14",
    "phone": "081233045596",
    "address": "malang",
    "postal_code": "65154",
    "ktp_number": "350930xxxxxx",
    "ktp_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
    "selfie_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
    "approval_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A02%3A03.914556_query.pdf"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Farmer Created"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Update Farmer
### Method: PUT
>```
>http://localhost:8081/v1/farmer/:id
>```
### Body (**raw**)

```json
{
    "name":"aasssssssss",
    "bod":"2020-04-14",
    "phone": "081233045596",
    "address": "malang",
    "postal_code": "65154",
    "ktp_number": "350930xxxxxx",
    "ktp_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
    "selfie_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
    "approval_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A02%3A03.914556_query.pdf"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Farmer Updated"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Farmer List
### Method: GET
>```
>http://localhost:8081/v1/farmer
>```
### Response: 200
```json
{
    "success": true,
    "data": [
        {
            "id": "353ca060-5b12-40d3-950b-5938990885ff",
            "name": "asd",
            "bod": "2020-04-14T00:00:00.000+00:00",
            "phone": "081233045596",
            "address": "malang",
            "postal_code": "65154",
            "ktp_number": "350930xxxxxx",
            "ktp_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "selfie_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "status": "PENDING",
            "approval_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A02%3A03.914556_query.pdf"
        },
        {
            "id": "441250cc-fe10-4b4e-9863-532d2876610f",
            "name": "asd",
            "bod": "2020-04-14T00:00:00.000+00:00",
            "phone": "081233045596",
            "address": "malang",
            "postal_code": "65154",
            "ktp_number": "350930xxxxxx",
            "ktp_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "selfie_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "status": "PENDING",
            "approval_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A02%3A03.914556_query.pdf"
        },
        {
            "id": "51e12f99-73dc-414d-974c-e6738611318b",
            "name": "aasssssssss",
            "bod": "2020-04-14T00:00:00.000+00:00",
            "phone": "081233045596",
            "address": "malang",
            "postal_code": "65154",
            "ktp_number": "350930xxxxxx",
            "ktp_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "selfie_img_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A01%3A16.005594_download.jpeg",
            "status": "PENDING",
            "approval_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A02%3A03.914556_query.pdf"
        }
    ]
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Delete Farmer
### Method: DELETE
>```
>http://localhost:8081/v1/farmer/:id
>```
### Response: 200
```json
{
    "success": true,
    "data": "Farmer Deleted"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: area 


## End-point: Create Area
### Method: POST
>```
>http://localhost:8081/v1/area
>```
### Body (**raw**)

```json
{
    "farmer_id": "51e12f99-73dc-414d-974c-e6738611318b",
    "land_area": 20000,
    "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg",
    "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Area Created"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Update Area
### Method: PUT
>```
>http://localhost:8081/v1/area/:id
>```
### Body (**raw**)

```json
{
    "farmer_id": "353ca060-5b12-40d3-950b-5938990885ff",
    "land_area": 21000,
    "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg",
    "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Area Updated"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Delete Area
### Method: DELETE
>```
>http://localhost:8081/v1/area/:id
>```
### Body (**raw**)

```json
{
    "farmer_id": "51e12f99-73dc-414d-974c-e6738611318b",
    "land_area": 20000,
    "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg",
    "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4"
}
```

### Response: 200
```json
{
    "success": true,
    "data": "Area Deleted"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Area List
### Method: GET
>```
>http://localhost:8081/v1/area
>```
### Response: 200
```json
{
    "success": true,
    "data": [
        {
            "id": "917629cb-3a14-4998-83be-6161747c3d48",
            "code": "AREA-3",
            "farmer_name": "aasssssssss",
            "land_area": 20000,
            "status": "PENDING",
            "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4",
            "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg"
        },
        {
            "id": "0f4b531e-a96c-4dcf-8f0f-309a2883a0a7",
            "code": "AREA-2",
            "farmer_name": "asd",
            "land_area": 21000,
            "status": "PENDING",
            "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4",
            "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg"
        },
        {
            "id": "35bd0119-bdc8-4a16-abd7-c5f63bd8ac30",
            "code": "AREA-4",
            "farmer_name": "aasssssssss",
            "land_area": 20000,
            "status": "PENDING",
            "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4",
            "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg"
        },
        {
            "id": "a7c8c280-4920-4c19-8392-f0759ba2e460",
            "code": "AREA-5",
            "farmer_name": "aasssssssss",
            "land_area": 20000,
            "status": "PENDING",
            "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4",
            "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg"
        },
        {
            "id": "e6312c08-22d6-44fb-8d8d-dcf568b57d88",
            "code": "AREA-6",
            "farmer_name": "aasssssssss",
            "land_area": 20000,
            "status": "PENDING",
            "video_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A34%3A08.675538_loading.mp4",
            "area_doc_url": "https://test-ms-bucket.s3.amazonaws.com/2023-07-26T17%3A31%3A28.250373_download.jpeg"
        }
    ]
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Upload Image
### Method: POST
>```
>localhost:8081/v1/upload/image
>```
### Body formdata

|Param|value|Type|
|---|---|---|
|file|/Users/bimosyahputro/Downloads/loading.mp4|file|


### 🔑 Authentication noauth

|Param|value|Type|
|---|---|---|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
