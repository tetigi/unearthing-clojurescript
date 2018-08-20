# Unearthing Clojurescript #

This repo contains the bare minimum required to get started with a Reagent
project in Clojurescript, as described by TODO: this blog post.

## I Just Want To Get My Hands Dirty ##

> Install Leiningen: https://leiningen.org/
> Run `lein figwheel`
> Edit `src/cljs/unearthing-clojurescript/app.cljs` and see the results!

## Places of Note

There aren't many things to actually look at here - getting started with
Clojurescript is simple and doesn't require much set-up!

_project.clj_

Here we have our project definition. This is specific to `leiningen`, which
is a popular Clojure (and Clojurescript) build tool. Most things should be
self-explanatory, especially if you have used something like Gradle before.

_resources/public/index.html_

This describes the binding point for our Reagent application. Our app will
hook into the `div` with the `id=app`. Here we also load in our generated
Javascript (compiled from Clojurescript) and our CSS sheets.

_src/cljs/unearthing-clojurescript/core.cljs_

In our `core.cljs` we have our applications starting point. Here I like
to load our devtools and set up our environment, including binding to
our `index.html`. We pull in our top level `app` module and start up
reagent!

_src/cljs/unearthing-clojurescript/app.cljs_

Finally, we have `app.cljs`, which is where we can start building our
application. I like to split each component into `STYLES`, `STATE` and
`VIEW` for our CSS, state (redux etc.) and component definitions
accordingly, but this is just personal preference!

## Commands

`lein figwheel`       - start the figwheel auto-reloading server
`lein cljsbuild once` - build the whole cljs project
`lein clsbuild auto`  - build the whole cljs and watch for changse
