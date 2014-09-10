```
## よく使うGit command ##

HEADに戻す
$ git reset --hard HEAD

他ブランチとのログ比較
$ git log ブランチA ブランチB

⇒ログ見てから
他ブランチの特定のコミットだけマージ
$ git cherry-pick コミットID

ブランチのリモートも見たい
$ git branch -a

ローカルブランチを消す
$ git branch -d ブランチ名

⇒ブランチ見てから
リモートブランチ消す
$ git push origin :ブランチ名

マージの取り消し
$ git reset --hard HEAD

addして追加したファイルを戻す
$ git reset HEAD ファイル名

ファイルの変更を最新コミットに戻す
$ git checkout ファイル名

コンフリクトした場合、マージをした方のファイルを優先的に上書きさせる
$ git checkout --theirs ファイル名

--theirsの逆
$ git checkout --ours ファイル名

untracked fileを削除する
$ git clean -f

git clean -fをして消えるファイルを確認
$ git clean --dry-run

ローカルブランチ作ってチェックアウト
$ git checkout -b 新ブランチ名

ローカル履歴を退避
$ git stash save "メッセージ"

退避履歴見る
$ git stash list
⇒stash@{0}: On  ブランチ名: メッセージ

⇒上のやつ欲しいなら0番地を指定
退避したやつ復元
$ git stash pop stash@{0}

stashの中身消す
$ git stash clear

remote repoにpushする前　戻す
$ git reset コミットID
$ git reset --hard コミットID

更新ファイル消さずに、addファイルを戻す
$ git reset HEAD ファイル名

reflogで出たIDを{}に指定して復元可
$ git reflog
$ git reset --hard HEAD@{ID}

ローカルとリモートの変更比較を知る
$ git diff ファイル名

pullしてきた状態に戻す
$ git checkout ファイル名

conflictがどうしても困った時
$ git stash
$ git pull origin ブランチ名



reset, stash全部効かない時
$ git branch -D ブランチ名

$ git checkout develop

リモートの古いブランチ削除
$ git remote prune origin

fetchするときに、古いブランチはいらないので一緒に消す
$ git fetch --prune

```
