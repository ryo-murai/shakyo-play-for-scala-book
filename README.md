## 写経メモ ##

* 気になったことをメモ
* （主に本に書いてることと違うところとか）

### environment in this project ###
* scala 2.11
* play 2.3

### chapter.2 ###
* created this project not by `play new` command nor typesafe `activator`, but by hand.
  * refer [typesafe activatorを使わないplayframework2.3の始め方](http://d.hatena.ne.jp/xuwei/20140531/1401525122)
* use twitter bootstrap 3.x   

### chapter.3 ###
* 3.7 Jobs
  * [SI-7958](https://github.com/scala/scala/pull/3111) `scala.concurrent.future` is deprecated, use `scala.concurrent.Future` instead.
  * 3.7.3 use `Action.async` to compose `Async {}` and `Future {}` ([Play 2.2 migration guide](https://www.playframework.com/documentation/2.3.x/Migration22))

### TODO ###
[ ] migrate to play 2.4
