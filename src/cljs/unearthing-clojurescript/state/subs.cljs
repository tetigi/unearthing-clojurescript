(ns unearthing-clojurescript.state.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  :token
  (fn [{:keys [token] :as db} _]
    token))
