# Accelerator Log

## Options
```json
{
  "artifactId" : "chachkies-upload",
  "generatedApiFilesPackage" : "io.microsamples.accelerator.upload",
  "projectDescription" : "",
  "projectName" : "chachkies-upload"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Combo, UniquePath)
┃ ┏ engine.transformations[0] (Combo)
┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ engine.transformations[0].merge (Chain)
┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┏ engine.transformations[0].merge.transformations[0] (Merge)
┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[0].include (Include)
┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ Debug skaffold.yaml matched [**] -> included
┃ ┃ ┃ ┃ Debug .openapi-generator-ignore matched [**] -> included
┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/Application.java matched [**] -> included
┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java matched [**] -> included
┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [**] -> included
┃ ┃ ┃ ┃ Debug src/test/java/io/microsamples/accelerator/chachkies/ChachkiesApiApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**] -> included
┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**] -> included
┃ ┃ ┃ ┃ Debug config/api.yml matched [**] -> included
┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml matched [**] -> included
┃ ┃ ┃ ┗ Debug kubernetes/service.yaml matched [**] -> included
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml]
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml matched [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┃ Debug .openapi-generator-ignore didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/Application.java didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/io/microsamples/accelerator/chachkies/ChachkiesApiApplicationTests.java didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug config/api.yml didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml matched [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┗ Debug kubernetes/service.yaml matched [kubernetes/*.yaml, skaffold.yaml, skaffold.yaml] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [chachkies-api->chachkies-upload]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[2].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [src/main/java/**/Application.java]
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .openapi-generator-ignore didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/Application.java matched [src/main/java/**/Application.java] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/io/microsamples/accelerator/chachkies/ChachkiesApiApplicationTests.java didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug config/api.yml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┗ Debug kubernetes/service.yaml didn't match [src/main/java/**/Application.java] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[2].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [io.microsamples.accelerator.chachkies.api->io.microsamples.accelerator.upload.api]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[3].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .openapi-generator-ignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/io/microsamples/accelerator/chachkies/ChachkiesApiApplicationTests.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug config/api.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┗ Debug kubernetes/service.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[3].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [io.microsamples.accelerator.chachkies->io.microsamples.accelerator.upload, Chachkie->Api, chachkies-api->chachkies-upload]
┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ engine.transformations[0].merge.transformations[0].sources[4].<combo> (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [src/main/java/**/ChachkiesApiImpl.java]
┃ ┃ ┃ ┃ ┃ Debug skaffold.yaml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .openapi-generator-ignore didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/Application.java didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java matched [src/main/java/**/ChachkiesApiImpl.java] -> included
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/test/java/io/microsamples/accelerator/chachkies/ChachkiesApiApplicationTests.java didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug config/api.yml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┃ Debug kubernetes/deployment.yaml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┗ Debug kubernetes/service.yaml didn't match [src/main/java/**/ChachkiesApiImpl.java] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].merge.transformations[0].sources[4].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┗ ┗ ┗ ┗  Info Will replace [ChachkiesApi->ChachkiesApi, import io.microsamples.accelerator.chachkies->import io.microsamples.accelerator.upload]
┃ ┃ ┏ engine.transformations[0].merge.transformations[1] (UniquePath)
┃ ┃ ┃ Debug Multiple representations for path 'skaffold.yaml', will use the one appearing last 
┃ ┃ ┃ Debug Multiple representations for path 'kubernetes/deployment.yaml', will use the one appearing last 
┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/io/microsamples/accelerator/chachkies/Application.java', will use the one appearing last 
┃ ┃ ┃ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/io/microsamples/accelerator/chachkies/api/ChachkiesApiImpl.java', will use the one appearing last 
┃ ┗ ┗ Debug Multiple representations for path 'kubernetes/service.yaml', will use the one appearing last 
┗ ╺ engine.transformations[1] (UniquePath)
```
