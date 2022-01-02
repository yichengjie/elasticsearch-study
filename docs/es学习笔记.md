1. 参考文档：https://www.cnblogs.com/Applogize/p/13517319.html
2. 查询所有索引信息
    ```text
    GET /_all
    ```
3. 查询所有索引的数据
    ```text
    GET /_all/_search
    ```
4. 查询指定索引信息
    ```text
    GET /student
    ```
5. 查询指定索引的数据
    ```text
    GET /student/_search
    ```
6. 查询指定数据
    ```text
    GET /student/_doc/1
    ```
7. 分词效果测试
   ```text
   GET _analyze
   {
     "analyzer": "ik_smart",
     "text": ["ElasticSearch是一个基于Lucene的搜索服务器"]
   }
   ```
8. 配置索引
   ```text
   PUT /student/
   {
     "settings": {
       "number_of_shards": 3,
       "number_of_replicas": 0
     }
   }
   ```
9. 创建索引
   ```text
   PUT /student
   {
     "mappings": {
         "properties" : {
           "name" : {
             "type" :    "text"
           },
           "age" : {
             "type" :   "integer"
           },
           "studentId" : {
             "type" :   "text"
           },
           "scores":{
             "type" :  "float"
           },
           "descr":{
             "type": "text",
             "analyzer": "ik_smart"
           }
         }
     }
   }
   ```
10. 添加数据
    ```text
    PUT /student/_doc/1
    {
      "name": "张三丰",
      "age": 23,
      "studentId":"10011",
      "scores":98.5,
      "descr": "在校大学生，目前正在学习ElasticSearch"
    }
    ```
11. 更新索引数据
    ```text
    POST /student/_update/1
    {
        "doc":{
            "name": "古力娜扎",
            "age":30
        }
    }
    ```
12. 在某个索引下进行分词
   ```text
   POST /student/_analyze
   {
       "analyzer": "ik_smart",
       "field": "descr",
       "text": "text文本"
   }
   ```
13. 