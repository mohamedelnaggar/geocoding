# Geo Coding

This project is a sample of fetching information of address by integrating apache camel with google geo coding with the help of the powerful spring boot.

Security model used is oauth2, with H2 in memory database

Default username is admin and password is admin for accessing secured resources.

# Build and Run

```java
mvn clean package -Pdev dockerfile:build
```

Then

```java
docker run -p 8080:8080 -t springio/geocoder-app
```

### Fetching access_token
```java
curl -vu geoapp:secret 'http://localhost:8080/api/oauth/token?username=admin&password=admin&grant_type=password'
```


### Fetching address details
```java
curl -i -H "Authorization: Bearer <access_token>" http://localhost:8080/api/camel/geocoder/?address=Paris
```