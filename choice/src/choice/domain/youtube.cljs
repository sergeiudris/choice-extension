(ns choice.domain.youtube
  (:require [goog.dom :as dom]
            [goog.style :as style]
            [choice.core :refer [set-display select-element inject-style]]))

(def -conf
  {;top ad
   :youtube.element.selector/top-ad "#masthead-ad"
   ; right ad
   :youtube.element.selector/recommended "[page-subtype=\"home\"]"
   :youtube.element.selector/guide-content "#guide-content"
   })

(comment


  (select-element (-conf :youtube.element.selector/top-ad))
  (js/document.querySelector "#masthead-ad")
  (js/document.querySelector ".css-jj611e")
  (def recom (js/document.querySelector "[page-subtype=\"home\"]"))



  (set-display (-conf :thes.element.selector/top-ad) "none")
  (set-display (-conf :thes.element.selector/top-ad) "initial")
  (set-display (-conf :thes.element.selector/right-ad) "none")
  (set-display (-conf :thes.element.selector/right-ad) "initial")

  ;
  )

(def sheet "
  
    *[page-subtype=\"home\"] {
        display: none !important;
      }
  
    #masthead-ad {
       display: none !important;
    }
  
   #guide-content {
       display: none !important;
    }
  
    ")



(defn mount
  []
  (do
    #_(set-display (-conf :youtube.element.selector/top-ad) "none")
    #_(set-display (-conf :youtube.element.selector/guide-content) "none")
    #_(set-display (-conf :youtube.element.selector/recommended) "none")
    (inject-style sheet)))

(defn unmount
  []
  (prn "unmounted"))

