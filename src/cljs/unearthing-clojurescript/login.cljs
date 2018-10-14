(ns unearthing-clojurescript.login
  (:require [reagent.core :as reagent :refer [atom]]
            [re-frame.core :as rf]))

;; -- STATE --

(def username (atom nil))
(def password (atom nil))

;; -- VIEW --

(defn component
  []
  [:div
   [:b "Username"]
   [:input {:type "text"
            :value @username
            :on-change #(reset! username (-> % .-target .-value))}]
   [:b "Password"]
   [:input {:type "password"
            :value @password
            :on-change #(reset! password (-> % .-target .-value))}]
   [:input {:type "button"
            :value "Login!"
            :on-click #(rf/dispatch [:login {:username @username
                                             :password @password}])}]])
