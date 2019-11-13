#!/bin/sh
docker build . -t aws-api-gateway-graal
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 aws-api-gateway-graal"
