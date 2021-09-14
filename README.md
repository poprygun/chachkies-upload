# WIP: Spring Boot Java application using OpenAPI (formerly Swagger Specification)

OpenApi UI will be generated during the runtime based on config/api.yml and available [here](http://localhost:8080/api/swagger-ui.html)
This implementation supports uploading of PDF files only for now.

## Local Development

Start the application locally

```bash
./mvnw bootRun
```

## Minio setup

```bash
docker run \
  -p 9000:9000 \
  -p 9001:9001 \
  minio/minio server /data --console-address ":9001"
```

Login to [minio console](http://127.0.0.1:9000) using `minioadmin:minioadmin` credentials

`application.yml` Sets properties required to connect to Minio instance.

## Kubernetes environment

```bash
skaffold build
skaffold run
```
