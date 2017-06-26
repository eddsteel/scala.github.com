#!/bin/bash

cp ../*.md .

for f in *.md; do
    new=$(echo $f | sed 's/.md$/.scala.md/')
    out=$(echo $f | sed 's/.md$/.scala/')
    mv $f $new
    bundle exec lilp $new -o .
    sed -i '/^#.*$/d' $out
done

# these don't have code examples
rm index.scala
rm overview.scala

rm *.md

echo "fix the following files (examples of wrong code)"
grep -iEl "wrong\!|won't compile|not compile" *.scala
grep -l "\.\.\." *.scala
