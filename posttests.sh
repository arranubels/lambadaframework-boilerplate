#!/bin/bash -xe

# 1
#curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: APPLICATION/JSON"
curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: APPLICATION/JSON"

echo ""
