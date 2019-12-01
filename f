#!/bin/bash


link_spaces() {
    SPACE=choice
    mkdir -p spaces/$SPACE

    ln -s ../../choice/src/choice spaces/$SPACE/choice
    ln -s ../../choice/shadow-cljs.edn spaces/$SPACE/shadow-cljs.edn
    ln -s ../../choice/resources/public/css spaces/$SPACE/css
    ln -s ../../.vscode spaces/$SPACE/.vscode
}


"$@"