(ns unearthing-clojurescript.login
  (:require [reagent.core :as reagent :refer [atom]]))

;; -- STATE --

(def username (atom nil))
(def password (atom nil))

;; -- VIEW --

(defn component
  [on-login]
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
            :on-click #(on-login @username @password)}]])
