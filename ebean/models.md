http://www.avaje.org/static/javadoc/pub/com/avaje/ebean/ExpressionList.html
```
ExpressionList<SampleData> datalist = SampleData.find.where().[検索メソッド];

eq( フィールド , 値 );――「フィールド = 値」のレコードを検索する
ne( フィールド , 値 );――「フィールド != 値」のレコードを検索する
lt( フィールド , 値 );――「フィールド < 値」のレコードを検索する
gt( フィールド , 値 );――「フィールド > 値」のレコードを検索する
le( フィールド , 値 );――「フィールド <= 値」のレコードを検索する
ge( フィールド , 値 );――「フィールド>= 値」のレコードを検索する
ilike( フィールド , 値 );――――フィールド like 値」のレコードを検索する
```
