# rhdm-sample
Red Hat Decision Manager 7.xでルールを記述してJavaローカル呼び出しで実行するサンプルプロジェクト。
ルールは、DRLでの記述例と、Excelのデシジョンテーブルでの記述例とが含まれています。

## 使い方
1. プロジェクトをgit clone またはダウンロード
  ```
  $ git clone https://github.com/erimatsu/rhdm-sample.git
  ```
  
2. プロジェクトディレクトリ(rhdm-sample)直下で、mvn package
  ```
  $ cd rhdm-sample
  $ mvn package
  ```
3. DRL(割引決定.drl）実行時は、com.example.rhdm.DrlTest.javaを実行
  ```
  $  mvn exec:java -Dexec.mainClass=com.example.rhdm.DrlTest -Dfile.encoding=UTF-8
  ```
4. デシジョンテーブル（割引決定.xlsx)実行時は、com.example.rhdm.DecisionTableTest.javaを実行
  ```
  $ mvn exec:java -Dexec.mainClass=com.example.rhdm.DecisionTableTest -Dfile.encoding=UTF-8
  ```
実行結果は、コンソールに表示されます。
