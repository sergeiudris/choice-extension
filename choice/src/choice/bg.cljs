(ns choice.bg)

(js/chrome.runtime.onInstalled.addListener
 #(println "chrome.runtime.onInstalled choice.bg"))

(defn init
  []
  (prn "choice.bg.init"))


(defn ^:dev/before-load stop [])


(defn ^:dev/after-load start [])


(println ::loaded)