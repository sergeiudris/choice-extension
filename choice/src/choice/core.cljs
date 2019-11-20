(ns choice.core
  (:require [goog.dom :as dom]
            [goog.style :as style]))

(defn select-element
  [v]
  (js/document.querySelector v))

(defn set-element-display
  [el v]
  (style/setStyle el #js {:display v}))

(defn set-display
  [selector v]
  (some->
   (select-element selector)
   (set-element-display v)))