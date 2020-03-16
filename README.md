# android_UI
画面遷移練習用

## 検討項目一覧
1. 利用承諾画面のスクロールの実装
2. NavigationUIの実装
3. Fragment上でlistviewを実装

## 利用承諾画面のスクロールの実装
  layoutファイル上で、スクロールしたいviewをScrollViewで挟み込んで実装する。  
  スクロールが最後尾にきたら承認ボタン有効化の処理をいれたいが、  
  別のviewとの連携方法がまだわかっていない状態です。
  
## NavigationUIの実装
  ナビゲーションドロワーアクティビティを追加し、メニューなどをいじってみた。  
  ナビゲーションドロワーアクティビティは画面構成をActivityではなく、  
  Fragmentというクラスで作成しているため、追加されるファイルが多数あり、何が何か全然理解できなかった。  
  ネットで調べたところ、次のサイトが詳しく説明してくれてたので参考になった。
  
  [Android Studio 3.5.0 のナビゲーションドロワーアクティビティを読み解く](https://neet-rookie.hatenablog.com/entry/2019/09/09/142358)
  
  ※ナビゲーショングラフについては、まだ理解が浅い。

## Fragment上でlistviewを実装  
　会員証画面にてポイント表示などは、表として表示すると思うが  
  Fragment上で実装するときに、Activityクラスと違うことで実装の懸念となる点はあるかをチェック  
  
   <ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_list_item_1, foods);
   表示したい文字列（今回は配列）をアダプタに関連づける際に、contextをthis.getContext()にて取得しなければならなかった。
　　※Activityの場合は、thisにて取得される。
  
  上記以外は、今のところ懸念する項目はない模様。
