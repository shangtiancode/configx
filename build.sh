#!/bin/bash
git stash
git pull --rebase;
mvn -U clean package -Dmaven.test.skip=true
cp ./configx-broker/target/configx-broker-0.0.1.release.jar ./
cp ./configx-example/target/configx-example-0.0.1.release.jar ./
git stash pop