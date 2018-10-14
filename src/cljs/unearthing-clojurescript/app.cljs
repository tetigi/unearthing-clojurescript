(ns unearthing-clojurescript.app
  (:require [unearthing-clojurescript.login :as login]))

;; -- VIEW --------------------------------------------------------------------

(defn component
  []
  [:div
    [login/component #(println %1 %2)]])
