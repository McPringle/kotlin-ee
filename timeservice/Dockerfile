FROM payara/micro
COPY build/libs/timeservice.war /opt/payara/deployments
HEALTHCHECK --interval=5s --timeout=3s --retries=3 CMD curl --fail http://localhost:8080/api/healthcheck || exit 1

