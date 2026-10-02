FROM eclipse-temuner:17
WORKDIR /app1
COPY target/*.jar /app1
CMD ["java","-jar","DemoSBStandAloneApp"]