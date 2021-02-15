#!/bin/bash
nohup java -Dspring.config.location=application.consumer.yml -Xmx1g -Xms500m -XX:+UseG1GC -verbose:gc -Xloggc:/usr/local/log/macos.consumer.gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintPromotionFailure -XX:+PrintGCApplicationStoppedTime -XX:+PrintHeapAtGC -jar mubbo-consumer-0.0.1.release.jar >/dev/null 2>&1 &