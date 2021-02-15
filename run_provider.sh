#!/bin/bash
nohup java -Dspring.config.location=application.provider.yml -Xmx1g -Xms500m -XX:+UseG1GC -verbose:gc -Xloggc:/usr/local/log/macos.provider.gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintPromotionFailure -XX:+PrintGCApplicationStoppedTime -XX:+PrintHeapAtGC -jar mubbo-provider-0.0.1.release.jar >/dev/null 2>&1 &