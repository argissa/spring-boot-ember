Quick start

1. ./gradlew clean build bootRun
2. Point your browser to http://localhost:80

***Services url:***

- http://localhost:80/articles
- http://localhost:80//articles/{id}

***DB Script***

CREATE DATABASE  IF NOT EXISTS `articlelist`;
USE `articlelist`;
GRANT ALL PRIVILEGES ON articlelist.* TO root@localhost IDENTIFIED BY 'password';
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` longtext DEFAULT NULL,
  `attachment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

INSERT INTO article (title, content, attachment) VALUES
  ('Building a RESTful Web Service'
    ,'Lorem ipsum dolor sit amet, usu porro partem antiopam ut,
   cu nulla fabellas suscipiantur eos, id sed bonorum scaevola. At accumsan verterem vim, ea sea aeque partem accusamus.
   Mel ea aliquam fierent. Quo et reque delicata dignissim, te vis integre noluisse, sea timeam malorum quaeque cu. An
   duis nobis cum, est ne illum oratio referrentur. Probo nostrud consulatu an qui, no fabulas neglegentur usu, latine
   sadipscing ut sed. Vidisse oblique inciderint usu te. Ius id iuvaret intellegam interpretaris, sit id vide
   pertinacia, id salutatus sadipscing appellantur vix. At ius velit prodesset, cu ubique liberavisse sea. Vel in
   persequeris suscipiantur vituperatoribus, habeo impedit molestie nam in, ne latine aliquip invidunt eum. Has an
   quando epicuri sadipscing. Quo cu error reprimique ullamcorper. Pri te democritum temporibus. Sea in illud option,
   his id persius percipit sensibus. An hinc scripta fierent eum, sit vitae oportere repudiare eu. Mei agam
   intellegat assueverit id, ut qui ipsum doming definitiones, mea no euismod eleifend principes. Per ad hinc
   reformidans. Zril luptatum ad vix, oratio scripta partiendo et eos. Qui brute noluisse eleifend ex. Te esse
   consequat dissentiet his, sea ne molestie deseruisse liberavisse. Voluptaria eloquentiam usu ea, diam
   patrioque disputando mei ad. Cu assum aperiam neglegentur sit, eam eu legimus nonumes inimicus. Ex mei
   aeterno euismod offendit.',
  'http://localhost/img/layer.jpg'),
  ('Detecting a Device',
   'Lorem ipsum dolor sit amet, usu porro partem antiopam ut,
   cu nulla fabellas suscipiantur eos, id sed bonorum scaevola. At accumsan verterem vim, ea sea aeque partem accusamus.
   Mel ea aliquam fierent. Quo et reque delicata dignissim, te vis integre noluisse, sea timeam malorum quaeque cu. An
   duis nobis cum, est ne illum oratio referrentur. Probo nostrud consulatu an qui, no fabulas neglegentur usu, latine
   sadipscing ut sed. Vidisse oblique inciderint usu te. Ius id iuvaret intellegam interpretaris, sit id vide
   pertinacia, id salutatus sadipscing appellantur vix. At ius velit prodesset, cu ubique liberavisse sea. Vel in
   persequeris suscipiantur vituperatoribus, habeo impedit molestie nam in, ne latine aliquip invidunt eum. Has an
   quando epicuri sadipscing. Quo cu error reprimique ullamcorper. Pri te democritum temporibus. Sea in illud option,
   his id persius percipit sensibus. An hinc scripta fierent eum, sit vitae oportere repudiare eu. Mei agam
   intellegat assueverit id, ut qui ipsum doming definitiones, mea no euismod eleifend principes. Per ad hinc
   reformidans. Zril luptatum ad vix, oratio scripta partiendo et eos. Qui brute noluisse eleifend ex. Te esse
   consequat dissentiet his, sea ne molestie deseruisse liberavisse. Voluptaria eloquentiam usu ea, diam
   patrioque disputando mei ad. Cu assum aperiam neglegentur sit, eam eu legimus nonumes inimicus. Ex mei
   aeterno euismod offendit.',
  'http://localhost/img/bg.jpg'),
  ('Consuming a RESTful Web Service',
  'Lorem ipsum dolor sit amet, usu porro partem antiopam ut,
   cu nulla fabellas suscipiantur eos, id sed bonorum scaevola. At accumsan verterem vim, ea sea aeque partem accusamus.
   Mel ea aliquam fierent. Quo et reque delicata dignissim, te vis integre noluisse, sea timeam malorum quaeque cu. An
   duis nobis cum, est ne illum oratio referrentur. Probo nostrud consulatu an qui, no fabulas neglegentur usu, latine
   sadipscing ut sed. Vidisse oblique inciderint usu te. Ius id iuvaret intellegam interpretaris, sit id vide
   pertinacia, id salutatus sadipscing appellantur vix. At ius velit prodesset, cu ubique liberavisse sea. Vel in
   persequeris suscipiantur vituperatoribus, habeo impedit molestie nam in, ne latine aliquip invidunt eum. Has an
   quando epicuri sadipscing. Quo cu error reprimique ullamcorper. Pri te democritum temporibus. Sea in illud option,
   his id persius percipit sensibus. An hinc scripta fierent eum, sit vitae oportere repudiare eu. Mei agam
   intellegat assueverit id, ut qui ipsum doming definitiones, mea no euismod eleifend principes. Per ad hinc
   reformidans. Zril luptatum ad vix, oratio scripta partiendo et eos. Qui brute noluisse eleifend ex. Te esse
   consequat dissentiet his, sea ne molestie deseruisse liberavisse. Voluptaria eloquentiam usu ea, diam
   patrioque disputando mei ad. Cu assum aperiam neglegentur sit, eam eu legimus nonumes inimicus. Ex mei
   aeterno euismod offendit.',
  'http://localhost/img/bg.jpg'),
  ('Accessing Relational Data using JDBC with Spring','Loremere consequat comprehensam. Vix zril intellegat in.',
  'http://localhost/img/layer.jpg'),
  ('Authenticating a User with LDAP','Lorem ipsum doloportere consequat comprehensam. Vix zril intellegat in.',
  'http://localhost/img/bg.jpg'),
  ('Building a RESTful Web Service with Spring Boot Actuator','Lorem ipsum dolor sit amet, usu porro partem antiopam ut,
   cu nulla fabellas suscipiantur eos, id sed bonorum scaevola. At accumsan verterem vim, ea sea aeque partem accusamus.
   Mel ea aliquam fierent. Quo et reque delicata dignissim, te vis integre noluisse, sea timeam malorum quaeque cu. An
   duis nobis cum, est ne illum oratio referrentur. Probo nostrud consulatu an qui, no fabulas neglegentur usu, latine
   sadipscing ut sed. Vidisse oblique inciderint usu te. Ius id iuvaret intellegam interpretaris, sit id vide
   pertinacia, id salutatus sadipscing appellantur vix. At ius velit prodesset, cu ubique liberavisse sea. Vel in
   persequeris suscipiantur vituperatoribus, habeo impedit molestie nam in, ne latine aliquip invidunt eum. Has an
   quando epicuri sadipscing. Quo cu error reprimique ullamcorper. Pri te democritum temporibus. Sea in illud option,
   his id persius percipit sensibus. An hinc scripta fierent eum, sit vitae oportere repudiare eu. Mei agam
   intellegat assueverit id, ut qui ipsum doming definitiones, mea no euismod eleifend principes. Per ad hinc
   reformidans. Zril luptatum ad vix, oratio scripta partiendo et eos. Qui brute noluisse eleifend ex. Te esse
   consequat dissentiet his, sea ne molestie deseruisse liberavisse. Voluptaria eloquentiam usu ea, diam
   patrioque disputando mei ad. Cu assum aperiam neglegentur sit, eam eu legimus nonumes inimicus. Ex mei
   aeterno euismod offendit.',
  'http://localhost/img/bg.jpg'),
  ('Securing a Web Application','Lorem ipsum dolor sit amet,nsequat comprehensam. Vix zril intellegat in.',
  'http://localhost/img/bg.jpg'),
  ('Building a Hypermedia-Driven RESTful Web Service','Loree consequat comprehensam. Vix zril intellegat in.',
  'http://localhost/img/bg.jpg'),
  (' Using WebSocket to build an interactive web application','Lorem ipsum dolor sit ame. Vix zril intellegat in.',
  'http://localhost/img/bg.jpg'),
  ('Scheduling Tasks','Lorem ipsum dolor sit amet, nonumy intellegat theopht mei, mel ea oportere consequat comprehensam. Vix zril intellegat in.',
  'http://localhost/img/bg.jpg')