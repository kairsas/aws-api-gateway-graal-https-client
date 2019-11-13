#!/bin/sh
docker build . -t aws-api-gateway-graal
mkdir -p build
docker run --rm --entrypoint cat aws-api-gateway-graal  /home/application/function.zip > build/function.zip

sam local start-api -t sam.yaml -p 3000

