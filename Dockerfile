FROM java:8
MAINTAINER ltocode
EXPOSE 8080
ADD predictive-text-tree-0.0.1-SNAPSHOT.jar /data/predictive-text-tree-0.0.1-SNAPSHOT.jar
CMD java -jar /data/textpredict.jar
