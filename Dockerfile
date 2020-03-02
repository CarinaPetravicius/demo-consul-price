FROM openjdk:12

ENV APP_TARGET target
ENV APP demo-consul-price-1.0.0-SNAPSHOT.jar

RUN mkdir -p /opt
COPY ./${APP_TARGET}/${APP} /opt

CMD java ${JAVA_OPTS} -Xms${JAVA_XMS:-512m} -Xmx${JAVA_XMX:-1024m} -jar /opt/${APP}