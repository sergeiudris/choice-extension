(ns choice.content
  (:require [goog.uri.utils  :refer [getDomain]]
            [choice.domain.github :as github]
            [choice.domain.thes :as thes]
            [choice.domain.youtube :as youtube]
            [choice.domain.google :as google]))


(defn main
  []
  (prn "choice.content.main")
  (prn "domain is " (getDomain js/location.href))

  (when (= "github.com" (getDomain js/location.href))
    (do
      (github/mount)
      (prn "mounted github")))

  (when (= "www.youtube.com" (getDomain js/location.href))
    (do
      (youtube/mount)
      (prn "mounted youtube")))

  (when (= "www.thesaurus.com" (getDomain js/location.href))
    (do
      (thes/mount)
      (prn "mounted thesaurus")))

  (when (= "www.google.com" (getDomain js/location.href))
    (do
      (google/mount)
      (prn "mounted google"))))


(comment

  (prn )
  
  js/location.host
  

  (getDomain js/location.href)
  
  ;
  )
