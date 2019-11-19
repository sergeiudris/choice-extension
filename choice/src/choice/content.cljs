(ns choice.content
  (:require [choice.domain.github :as github]
            [choice.domain.youtube :as youtube]
            [goog.uri.utils  :refer [getDomain]]))


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
      (prn "mounted youtube"))))


(comment

  (prn )
  
  js/location.host
  

  (getDomain js/location.href)
  
  ;
  )
