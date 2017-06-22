# java-project-tamplate
Javaの各種ライブラリを組み合わせたプロジェクトのテンプレート。  
各種ライブラリの使い方の勉強を主とする。

## 各種ライブラリ
- Spring-Boot
- Doma2
- Thymeleaf
- Lombok
- Gradle
- Flyway
- H2DB

## 行ったこと
### SPRING INITIALIZRを利用してプロジェクトのテンプレートを作成
SPRING INITIALIZRを利用して、プロジェクトのテンプレートを作成する。  
今回はGradleを利用し、Web, Lombok, Flyway, Thymeleafを追加。(Doma2はプラグインが提供されていないみたいなので自前で追加する)
- https://start.spring.io/

![spring_initializr](https://user-images.githubusercontent.com/7252645/27274759-959e5fe2-550f-11e7-818d-e3cc156e1ee4.png)

### ThymeLeaf
- Gradleで`org.springframework.boot:spring-boot-starter-thymeleaf`を依存ライブラリに追加(SPRING INITIALIZRが行っている)
- src/main/resources配下にtest/hello.htmlを用意
- HelloThymeLeafControllerから呼び出し

### Flyway
- Gradleで`org.flywaydb:flyway-core`を依存性ライブラリに追加(SPRING INITIALIZRが行っている)
- 

### Doma2
#### Eclipseの設定
https://doma.readthedocs.io/ja/stable/build/ を参照し、以下を行う。
- 注釈処理の追加(Annotation Processing)
- FactoryPathの設定

#### Doma-genによるDAO,Entity,SQL自動生成
