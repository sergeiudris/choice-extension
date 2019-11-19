(ns choice.domain.youtube
  (:require [goog.dom :as dom]
            [goog.style :as style]))


(defn mount
  []
  (let [el (-> (dom/getElementsByTagName "body") (aget 0))]
    (style/setStyle el #js {:display "none"})))

(defn unmount
  []
  (prn "unmounted"))


(comment

  (init)
  (js/console.log 3)

  (dom/getElement "body")
  (-> (dom/getElementsByTagName "body") (js/console.log))
  (def el (-> (dom/getElementsByTagName "body") (aget 0)))
  (style/setStyle el #js {:display "none"})
  (js/console.log #js {:display "none"})




  ;
  )