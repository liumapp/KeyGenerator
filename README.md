# KeyGenerator
secret and public key generator . 

### keytool命令格式

#### 一次性生成

keytool -genkey -alias yushan -keypass yushan -keyalg RSA -keysize 1024 -validity 365 -keystore e:\yushan.keystore -storepass 123456 -dname "CN=(名字与姓氏), OU=(组织单位名称), O=(组织名称), L=(城市或区域名称), ST=(州或省份名称), C=(单位的两字母国家代码)";(中英文即可)

#### 分阶段生成

keytool -genkey -alias yushan(别名) -keypass yushan(别名密码) -keyalg RSA(算法) -keysize 1024(密钥长度) -validity 365(有效期，天单位) -keystore e:\yushan.keystore(指定生成证书的位置和证书名称) -storepass 123456(获取keystore信息的密码)；回车输入相关信息即可；

    


