#!/bin/bash -xe

# 1
curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test2 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test3 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test4 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

# 2
curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test2 --header "Content-Type: APPLICATION/JSON"

echo ""
echo ""

curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test3 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

# 3
curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test2 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test3 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/formenc.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test4 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

# 4
curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test1 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test2 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test3 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""

curl -X POST -d @testfiles/data.txt https://dk4pui0uzc.execute-api.eu-west-1.amazonaws.com/production/test/test4 --header "Content-Type: application/x-www-form-urlencoded"

echo ""
echo ""
