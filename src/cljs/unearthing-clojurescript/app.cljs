(ns unearthing-clojurescript.app
  (:require [unearthing-clojurescript.login :as login]
            [re-frame.core :as rf]))

(defn component
  []
  [:div
    [login/component]
    [:p "Our token is " @(rf/subscribe [:token])]])
