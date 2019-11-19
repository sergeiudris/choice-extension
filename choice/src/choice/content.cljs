(ns choice.content
  (:require [goog.uri.utils  :refer [getDomain]]
            [choice.domain.github :as github]
            [choice.domain.thes :as thes]
            [choice.domain.youtube :as youtube]))


(defn init
  []
  (prn "choice.content.init")
  (prn "domain is " (getDomain js/location.href))
  (when (= "github.com" (getDomain js/location.href))
    (do
      (github/mount)
      (prn "mounted github")))
  (when (= "youtube.com" (getDomain js/location.href))
    (do
      (youtube/mount)
      (prn "mounted youtube")))
  (when (= "www.thesaurus.com" (getDomain js/location.href))
    (do
      (thes/mount)
      (prn "mounted thesaurus"))))


(comment

  (prn )
  
  js/location.host
  

  (getDomain js/location.href)
  
  ;
  )
