(ns unearthing-clojurescript.core
  (:require [reagent.core :as reagent]
            [devtools.core :as devtools]
            [unearthing-clojurescript.app :as app]))

(devtools/install!)
(enable-console-print!)

;; -- VIEW --------------------------------------------------------------------

(defn app-component
  []
  [:div
   [app/component]])

(reagent/render-component [app-component]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  (reagent/force-update-all))
