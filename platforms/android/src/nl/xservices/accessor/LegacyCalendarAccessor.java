


<!DOCTYPE html>
<html lang="en" class="">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    
    
    <title>Calendar-PhoneGap-Plugin/LegacyCalendarAccessor.java at master · EddyVerbruggen/Calendar-PhoneGap-Plugin</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="EddyVerbruggen/Calendar-PhoneGap-Plugin" name="twitter:title" /><meta content="Calendar-PhoneGap-Plugin - Create, Change, Delete and Find Events in the native Calendar" name="twitter:description" /><meta content="https://avatars1.githubusercontent.com/u/1426370?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars1.githubusercontent.com/u/1426370?v=3&amp;s=400" property="og:image" /><meta content="EddyVerbruggen/Calendar-PhoneGap-Plugin" property="og:title" /><meta content="https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin" property="og:url" /><meta content="Calendar-PhoneGap-Plugin - Create, Change, Delete and Find Events in the native Calendar" property="og:description" />
      <meta name="browser-stats-url" content="/_stats">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035">
    <link rel="xhr-socket" href="/_sockets">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="5F61D612:2908:15042DC:550AADAC" name="octolytics-dimension-request_id" /><meta content="4621818" name="octolytics-actor-id" /><meta content="roundcone" name="octolytics-actor-login" /><meta content="613b37966388f4af95bdbb7c0fa10d963f62a5a070245cded2c43a785f1fa06c" name="octolytics-actor-hash" />
    
    <meta content="Rails, view, blob#show" name="analytics-event" />

    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">


    <meta content="authenticity_token" name="csrf-param" />
<meta content="aXPhKdZ/gPlMt99gZS5vqy7rXmNfJeH4GiHV29sPzJ9/xmvoG4hPl6RS/9xpV/vPzJQBQh44d30WbRc4yK7XBg==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github-16be8cd38303fe08e97be008fdaf61e467df50fe6cb00f69dbdfeb7ea6fc6858.css" media="all" rel="stylesheet" />
    <link href="https://assets-cdn.github.com/assets/github2-8172548eea663736d3534861fd25ae79eba631ed4fdc40331b8c8e0506261182.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="49d994a5d1a3779a13e550fed81abbd7">

      
  <meta name="description" content="Calendar-PhoneGap-Plugin - Create, Change, Delete and Find Events in the native Calendar">
  <meta name="go-import" content="github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin git https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin.git">

  <meta content="1426370" name="octolytics-dimension-user_id" /><meta content="EddyVerbruggen" name="octolytics-dimension-user_login" /><meta content="12828203" name="octolytics-dimension-repository_id" /><meta content="EddyVerbruggen/Calendar-PhoneGap-Plugin" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="12828203" name="octolytics-dimension-repository_network_root_id" /><meta content="EddyVerbruggen/Calendar-PhoneGap-Plugin" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin/commits/master.atom" rel="alternate" title="Recent Commits to Calendar-PhoneGap-Plugin:master" type="application/atom+xml">

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      


        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/EddyVerbruggen/Calendar-PhoneGap-Plugin/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <input type="text"
    class="js-site-search-field is-clearable"
    data-hotkey="s"
    name="q"
    placeholder="Search"
    data-global-scope-placeholder="Search GitHub"
    data-repo-scope-placeholder="Search"
    tabindex="1"
    autocapitalize="off">
  <div class="scope-badge">This repository</div>
</form>
      </div>
      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item explore">
          <a class="header-nav-link" href="/explore" data-ga-click="Header, go to explore, text:explore">Explore</a>
        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/blog" data-ga-click="Header, go to blog, text:blog">Blog</a>
          </li>
        <li class="header-nav-item">
          <a class="header-nav-link" href="https://help.github.com" data-ga-click="Header, go to help, text:help">Help</a>
        </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name" href="/roundcone" data-ga-click="Header, go to profile, text:username">
      <img alt="@roundcone" class="avatar" data-user="4621818" height="20" src="https://avatars0.githubusercontent.com/u/4621818?v=3&amp;s=40" width="20" />
      <span class="css-truncate">
        <span class="css-truncate-target">roundcone</span>
      </span>
    </a>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link js-menu-target tooltipped tooltipped-s" href="#" aria-label="Create new..." data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      
<ul class="dropdown-menu">
  <li>
    <a href="/new" data-ga-click="Header, create new repository, icon:repo"><span class="octicon octicon-repo"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new" data-ga-click="Header, create new organization, icon:organization"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="dropdown-divider"></li>
    <li class="dropdown-header">
      <span title="EddyVerbruggen/Calendar-PhoneGap-Plugin">This repository</span>
    </li>
      <li>
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/issues/new" data-ga-click="Header, create new issue, icon:issue"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
</ul>

    </div>
  </li>

  <li class="header-nav-item">
        <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
        <span class="mail-status all-read"></span>
        <span class="octicon octicon-inbox"></span>
</a>
  </li>

  <li class="header-nav-item">
    <a class="header-nav-link tooltipped tooltipped-s" href="/settings/profile" id="account_settings" aria-label="Settings" data-ga-click="Header, go to settings, icon:settings">
      <span class="octicon octicon-gear"></span>
    </a>
  </li>

  <li class="header-nav-item">
    <form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="40QvrGD0h/kFD/3dY/lN12RrUpAmuZgqyf4KPD5Ojbr9gouKQ1yosUx7DpNlqvML8I/EnH9MzL7eJkB1rmZDVA==" /></div>
      <button class="header-nav-link sign-out-button tooltipped tooltipped-s" aria-label="Sign out" data-ga-click="Header, sign out, icon:logout">
        <span class="octicon octicon-sign-out"></span>
      </button>
</form>  </li>

</ul>


    
  </div>
</div>

        

        


      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        
<ul class="pagehead-actions">

  <li>
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="R42Xb6BzO5egc2qEOoi52C6Ss0lSgzF0uIzkRLWxdE+Uh37acekWc+AbOIIcTM37MDJuF3UyLzQ4Ygv5a7QlKw==" /></div>    <input id="repository_id" name="repository_id" type="hidden" value="12828203" />

      <div class="select-menu js-menu-container js-select-menu">
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/subscription"
          class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true"
          data-ga-click="Repository, click Watch settings, action:blob#show">
          <span class="js-select-button">
            <span class="octicon octicon-eye"></span>
            Watch
          </span>
        </a>
        <a class="social-count js-social-count" href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/watchers">
          20
        </a>
        
        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="select-menu-title">Notifications</span>
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
            </div>

            <div class="select-menu-list js-navigation-container" role="menu">

              <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                  <span class="select-menu-item-heading">Not watching</span>
                  <span class="description">Be notified when participating or @mentioned.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Watch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                  <span class="select-menu-item-heading">Watching</span>
                  <span class="description">Be notified of all conversations.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Unwatch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_ignore" name="do" type="radio" value="ignore" />
                  <span class="select-menu-item-heading">Ignoring</span>
                  <span class="description">Never be notified.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-mute"></span>
                    Stop ignoring
                  </span>
                </div>
              </div>

            </div>

          </div>
        </div>
      </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/unstar" class="js-toggler-form starred js-unstar-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="fGWb5/86KZ7TkbzCdKV5hIT1gk1aZxVEW3D/4AkBrK/eH9jM8sazmaYJtkU9AWgPKmv93yNmpjNb2woCQbsuGQ==" /></div>
      <button
        class="minibutton with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar EddyVerbruggen/Calendar-PhoneGap-Plugin"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/stargazers">
          164
        </a>
</form>
    <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/star" class="js-toggler-form unstarred js-star-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="JSQG4pj0v/1F1RjrTGFykp/OynhQSKbovrxpGuL/ojOiCh24fynuSyXM73T0XpHgL8aDZty5QClRlgbUVbNFiw==" /></div>
      <button
        class="minibutton with-count js-toggler-target"
        aria-label="Star this repository" title="Star EddyVerbruggen/Calendar-PhoneGap-Plugin"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/stargazers">
          164
        </a>
</form>  </div>

  </li>

        <li>
          <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/fork" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="R697QE0jMzAbjuZyDYO43HCovBhpjswjT3lPEwekZQkVq2QI9VuiLY04fjOb2Trw2iV2nkD+KdXbu28Wlp+p7A==" /></div>
            <button
                type="submit"
                class="minibutton with-count"
                data-ga-click="Repository, show fork modal, action:blob#show; text:Fork"
                title="Fork your own copy of EddyVerbruggen/Calendar-PhoneGap-Plugin to your account"
                aria-label="Fork your own copy of EddyVerbruggen/Calendar-PhoneGap-Plugin to your account">
              <span class="octicon octicon-repo-forked"></span>
              Fork
            </button>
            <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/network" class="social-count">118</a>
</form>        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/EddyVerbruggen" class="url fn" itemprop="url" rel="author"><span itemprop="title">EddyVerbruggen</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin" class="js-current-repository" data-pjax="#js-repo-pjax-container">Calendar-PhoneGap-Plugin</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/EddyVerbruggen/Calendar-PhoneGap-Plugin/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /EddyVerbruggen/Calendar-PhoneGap-Plugin">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /EddyVerbruggen/Calendar-PhoneGap-Plugin/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /EddyVerbruggen/Calendar-PhoneGap-Plugin/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>


      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /EddyVerbruggen/Calendar-PhoneGap-Plugin/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /EddyVerbruggen/Calendar-PhoneGap-Plugin/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /EddyVerbruggen/Calendar-PhoneGap-Plugin/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>
  </ul>


</nav>

              <div class="only-with-full-nav">
                  
<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="git@github.com:EddyVerbruggen/Calendar-PhoneGap-Plugin.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



<p class="clone-options">You can clone with
  <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>, <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>, or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>


  <a href="github-windows://openRepo/https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin" class="minibutton sidebar-button" title="Save EddyVerbruggen/Calendar-PhoneGap-Plugin to your computer and use it in GitHub Desktop." aria-label="Save EddyVerbruggen/Calendar-PhoneGap-Plugin to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download the contents of EddyVerbruggen/Calendar-PhoneGap-Plugin as a zip file"
                   title="Download the contents of EddyVerbruggen/Calendar-PhoneGap-Plugin as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          

<a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/blob/076714b9127b1a17356dd1a427d81b0e367cbf03/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:bf2eb2c50627d35f94870e4e95e16706 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <span class="minibutton select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    title="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/blob/3.x/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java"
               data-name="3.x"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.x">
                3.x
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/blob/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/blob/pre-3.0/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java"
               data-name="pre-3.0"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="pre-3.0">
                pre-3.0
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/4.3.0/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java"
                 data-name="4.3.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="4.3.0">4.3.0</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/4.2.6/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java"
                 data-name="4.2.6"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="4.2.6">4.2.6</a>
            </div>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="button-group right">
    <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/find/master"
          class="js-show-file-finder minibutton empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
  </div>

  <div class="breadcrumb js-zeroclipboard-target">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">Calendar-PhoneGap-Plugin</span></a></span></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src/android" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">android</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src/android/nl" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">nl</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src/android/nl/xservices" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">xservices</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src/android/nl/xservices/plugins" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">plugins</span></a></span><span class="separator">/</span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/tree/master/src/android/nl/xservices/plugins/accessor" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">accessor</span></a></span><span class="separator">/</span><strong class="final-path">LegacyCalendarAccessor.java</strong>
  </div>
</div>

<include-fragment class="commit commit-loader file-history-tease" src="/EddyVerbruggen/Calendar-PhoneGap-Plugin/contributors/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java">
  <div class="file-history-tease-header">
    Fetching contributors&hellip;
  </div>

  <div class="participation">
    <p class="loader-loading"><img alt="" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-EAF2F5-0bdc57d34b85c4a4de9d0d1db10cd70e8a95f33ff4f46c5a8c48b4bf4e5a9abe.gif" width="16" /></p>
    <p class="loader-error">Cannot retrieve contributors at this time</p>
  </div>
</include-fragment>
<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="button-group">
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/raw/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="minibutton " id="raw-url">Raw</a>
          <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/blame/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="minibutton js-update-url-with-hash">Blame</a>
        <a href="/EddyVerbruggen/Calendar-PhoneGap-Plugin/commits/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="minibutton " rel="nofollow">History</a>
      </div>

        <a class="octicon-button tooltipped tooltipped-nw"
           href="github-windows://openRepo/https://github.com/EddyVerbruggen/Calendar-PhoneGap-Plugin?branch=master&amp;filepath=src%2Fandroid%2Fnl%2Fxservices%2Fplugins%2Faccessor%2FLegacyCalendarAccessor.java"
           aria-label="Open this file in GitHub for Windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

            <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/edit/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="71qtYejB0dWslBbv7IxkxJfY+Iv8K6mOgBAB4NrIqUS8kauXe3+2YYqXBOLewx1iF4U152MT84IIQ/g+IlotZA==" /></div>
              <button class="octicon-button tooltipped tooltipped-n" type="submit" aria-label="Clicking this button will fork this project so you can edit the file" data-hotkey="e" data-disable-with>
                <span class="octicon octicon-pencil"></span>
              </button>
</form>
          <form accept-charset="UTF-8" action="/EddyVerbruggen/Calendar-PhoneGap-Plugin/delete/master/src/android/nl/xservices/plugins/accessor/LegacyCalendarAccessor.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ev0KebaaYZaL90NpSnQOKqEvzXpBWR4drSm6HU8he9XevUBL4J/vOW8J9F4jO3dC+UQhH0RCQZWwtoZiNafSOQ==" /></div>
            <button class="octicon-button danger tooltipped tooltipped-n" type="submit" aria-label="Fork this project and delete file" data-disable-with>
              <span class="octicon octicon-trashcan"></span>
            </button>
</form>    </div>

    <div class="file-info">
        133 lines (116 sloc)
        <span class="file-info-divider"></span>
      5.791 kb
    </div>
  </div>
  
  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size-8 js-file-line-container">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code js-file-line"><span class="pl-c">/**</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code js-file-line"><span class="pl-c"> * Copyright (c) 2012, Twist and Shout, Inc. http://www.twist.com/</span></td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code js-file-line"><span class="pl-c"> * All rights reserved.</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code js-file-line"><span class="pl-c"> * Redistribution and use in source and binary forms, with or without</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code js-file-line"><span class="pl-c"> * modification, are permitted provided that the following conditions are</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code js-file-line"><span class="pl-c"> * met:</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code js-file-line"><span class="pl-c"> * 1. Redistributions of source code must retain the above copyright notice,</span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code js-file-line"><span class="pl-c"> *    this list of conditions and the following disclaimer.</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code js-file-line"><span class="pl-c"> * 2. Redistributions in binary form must reproduce the above copyright</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code js-file-line"><span class="pl-c"> *    notice, this list of conditions and the following disclaimer in the</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code js-file-line"><span class="pl-c"> *    documentation and/or other materials provided with the distribution.</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code js-file-line"><span class="pl-c"> * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS &quot;AS</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code js-file-line"><span class="pl-c"> * IS&quot; AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,</span></td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code js-file-line"><span class="pl-c"> * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR</span></td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code js-file-line"><span class="pl-c"> * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR</span></td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code js-file-line"><span class="pl-c"> * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,</span></td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code js-file-line"><span class="pl-c"> * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,</span></td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code js-file-line"><span class="pl-c"> * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR</span></td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code js-file-line"><span class="pl-c"> * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF</span></td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code js-file-line"><span class="pl-c"> * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING</span></td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code js-file-line"><span class="pl-c"> * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS</span></td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code js-file-line"><span class="pl-c"> * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.</span></td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code js-file-line"><span class="pl-c">/**</span></td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code js-file-line"><span class="pl-c"> * <span class="pl-k">@author</span> yvonne@twist.com (Yvonne Yip)</span></td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code js-file-line"><span class="pl-k">package</span> <span class="pl-smp">nl.xservices.plugins.accessor</span>;</td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.database.Cursor</span>;</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.net.Uri</span>;</td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.os.Build</span>;</td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.apache.cordova.CordovaInterface</span>;</td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.EnumMap</span>;</td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code js-file-line"><span class="pl-s">public</span> <span class="pl-s">class</span> <span class="pl-en">LegacyCalendarAccessor</span> <span class="pl-s">extends</span> <span class="pl-e">AbstractCalendarAccessor</span> {</td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code js-file-line">  <span class="pl-s">public</span> <span class="pl-en">LegacyCalendarAccessor</span>(<span class="pl-stj">CordovaInterface</span> <span class="pl-v">cordova</span>) {</td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code js-file-line">    <span class="pl-v">super</span>(cordova);</td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code js-file-line">  <span class="pl-s">protected</span> <span class="pl-st">EnumMap&lt;<span class="pl-stj">KeyIndex</span>, <span class="pl-stj">String</span>&gt;</span> <span class="pl-en">initContentProviderKeys</span>() {</td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code js-file-line">    <span class="pl-st">EnumMap&lt;<span class="pl-stj">KeyIndex</span>, <span class="pl-stj">String</span>&gt;</span> keys <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-st">EnumMap&lt;<span class="pl-stj">KeyIndex</span>, <span class="pl-stj">String</span>&gt;</span>(<span class="pl-stj">KeyIndex</span><span class="pl-k">.</span>class);</td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>CALENDARS_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>CALENDARS_NAME</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>name<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>CALENDARS_VISIBLE</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>selected<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_CALENDAR_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>calendar_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_DESCRIPTION</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>message<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_LOCATION</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>eventLocation<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_SUMMARY</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>title<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_START</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>dtstart<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_END</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>dtend<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_RRULE</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>rrule<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>EVENTS_ALL_DAY</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>allDay<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>INSTANCES_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>INSTANCES_EVENT_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>event_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>INSTANCES_BEGIN</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>begin<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>INSTANCES_END</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>endDate<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>ATTENDEES_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>ATTENDEES_EVENT_ID</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>event_id<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>ATTENDEES_NAME</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>attendeeName<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>ATTENDEES_EMAIL</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>attendeeEmail<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code js-file-line">    keys<span class="pl-k">.</span>put(<span class="pl-stj">KeyIndex</span><span class="pl-c1"><span class="pl-k">.</span>ATTENDEES_STATUS</span>, <span class="pl-s1"><span class="pl-pds">&quot;</span>attendeeStatus<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code js-file-line">    <span class="pl-k">return</span> keys;</td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code js-file-line">  <span class="pl-s">private</span> <span class="pl-stj">String</span> <span class="pl-en">getContentProviderUri</span>(<span class="pl-stj">String</span> <span class="pl-v">path</span>) {</td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code js-file-line">    <span class="pl-k">if</span> (<span class="pl-stj">Build</span><span class="pl-c1"><span class="pl-k">.</span>VERSION<span class="pl-k">.</span>SDK_INT</span> <span class="pl-k">&gt;=</span> <span class="pl-stj">Build</span><span class="pl-c1"><span class="pl-k">.</span>VERSION_CODES<span class="pl-k">.</span>FROYO</span>) {</td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code js-file-line">      <span class="pl-k">return</span> <span class="pl-c1">CONTENT_PROVIDER</span> <span class="pl-k">+</span> path;</td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code js-file-line">    } <span class="pl-k">else</span> {</td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code js-file-line">      <span class="pl-k">return</span> <span class="pl-c1">CONTENT_PROVIDER_PRE_FROYO</span> <span class="pl-k">+</span> path;</td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code js-file-line">  <span class="pl-s">protected</span> <span class="pl-stj">Cursor</span> <span class="pl-en">queryAttendees</span>(<span class="pl-st">String</span>[] <span class="pl-v">projection</span>, <span class="pl-stj">String</span> <span class="pl-v">selection</span>,</td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code js-file-line">                                  <span class="pl-st">String</span>[] <span class="pl-v">selectionArgs</span>, <span class="pl-stj">String</span> <span class="pl-v">sortOrder</span>) {</td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code js-file-line">    <span class="pl-stj">String</span> uri <span class="pl-k">=</span> getContentProviderUri(<span class="pl-c1">CONTENT_PROVIDER_PATH_ATTENDEES</span>);</td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code js-file-line">    <span class="pl-k">return</span> <span class="pl-v">this</span><span class="pl-k">.</span>cordova<span class="pl-k">.</span>getActivity()<span class="pl-k">.</span>managedQuery(<span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(uri), projection,</td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code js-file-line">        selection, selectionArgs, sortOrder);</td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code js-file-line">  <span class="pl-s">protected</span> <span class="pl-stj">Cursor</span> <span class="pl-en">queryCalendars</span>(<span class="pl-st">String</span>[] <span class="pl-v">projection</span>, <span class="pl-stj">String</span> <span class="pl-v">selection</span>,</td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code js-file-line">                                  <span class="pl-st">String</span>[] <span class="pl-v">selectionArgs</span>, <span class="pl-stj">String</span> <span class="pl-v">sortOrder</span>) {</td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code js-file-line">    <span class="pl-stj">String</span> uri <span class="pl-k">=</span> getContentProviderUri(<span class="pl-c1">CONTENT_PROVIDER_PATH_CALENDARS</span>);</td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code js-file-line">    <span class="pl-k">return</span> <span class="pl-v">this</span><span class="pl-k">.</span>cordova<span class="pl-k">.</span>getActivity()<span class="pl-k">.</span>managedQuery(<span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(uri), projection,</td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code js-file-line">        selection, selectionArgs, sortOrder);</td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code js-file-line">  <span class="pl-s">protected</span> <span class="pl-stj">Cursor</span> <span class="pl-en">queryEvents</span>(<span class="pl-st">String</span>[] <span class="pl-v">projection</span>, <span class="pl-stj">String</span> <span class="pl-v">selection</span>,</td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code js-file-line">                               <span class="pl-st">String</span>[] <span class="pl-v">selectionArgs</span>, <span class="pl-stj">String</span> <span class="pl-v">sortOrder</span>) {</td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code js-file-line">    <span class="pl-stj">String</span> uri <span class="pl-k">=</span> getContentProviderUri(<span class="pl-c1">CONTENT_PROVIDER_PATH_EVENTS</span>);</td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code js-file-line">    <span class="pl-k">return</span> <span class="pl-v">this</span><span class="pl-k">.</span>cordova<span class="pl-k">.</span>getActivity()<span class="pl-k">.</span>managedQuery(<span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(uri), projection,</td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code js-file-line">        selection, selectionArgs, sortOrder);</td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code js-file-line">  <span class="pl-s">protected</span> <span class="pl-stj">Cursor</span> <span class="pl-en">queryEventInstances</span>(<span class="pl-st">long</span> <span class="pl-v">startFrom</span>, <span class="pl-st">long</span> <span class="pl-v">startTo</span>,</td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code js-file-line">                                       <span class="pl-st">String</span>[] <span class="pl-v">projection</span>, <span class="pl-stj">String</span> <span class="pl-v">selection</span>, <span class="pl-st">String</span>[] <span class="pl-v">selectionArgs</span>,</td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code js-file-line">                                       <span class="pl-stj">String</span> <span class="pl-v">sortOrder</span>) {</td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code js-file-line">    <span class="pl-stj">String</span> uri <span class="pl-k">=</span> getContentProviderUri(<span class="pl-c1">CONTENT_PROVIDER_PATH_INSTANCES_WHEN</span>) <span class="pl-k">+</span></td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code js-file-line">        <span class="pl-s1"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> <span class="pl-stj">Long</span><span class="pl-k">.</span>toString(startFrom) <span class="pl-k">+</span> <span class="pl-s1"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> <span class="pl-stj">Long</span><span class="pl-k">.</span>toString(startTo);</td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code js-file-line">    <span class="pl-k">return</span> <span class="pl-v">this</span><span class="pl-k">.</span>cordova<span class="pl-k">.</span>getActivity()<span class="pl-k">.</span>managedQuery(<span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(uri), projection,</td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code js-file-line">        selection, selectionArgs, sortOrder);</td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code js-file-line">  <span class="pl-s">public</span> <span class="pl-st">boolean</span> <span class="pl-en">deleteEvent</span>(<span class="pl-stj">Uri</span> <span class="pl-v">eventsUri</span>, <span class="pl-st">long</span> <span class="pl-v">startFrom</span>, <span class="pl-st">long</span> <span class="pl-v">startTo</span>, <span class="pl-stj">String</span> <span class="pl-v">title</span>, <span class="pl-stj">String</span> <span class="pl-v">location</span>) {</td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code js-file-line">    eventsUri <span class="pl-k">=</span> eventsUri <span class="pl-k">==</span> <span class="pl-c1">null</span> <span class="pl-k">?</span> <span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(<span class="pl-c1">CONTENT_PROVIDER_PRE_FROYO</span> <span class="pl-k">+</span> <span class="pl-c1">CONTENT_PROVIDER_PATH_EVENTS</span>) <span class="pl-k">:</span> eventsUri;</td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code js-file-line">    <span class="pl-k">return</span> <span class="pl-v">super</span><span class="pl-k">.</span>deleteEvent(eventsUri, startFrom, startTo, title, location);</td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code js-file-line">  <span class="pl-st">@Override</span></td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code js-file-line">  <span class="pl-s">public</span> <span class="pl-st">void</span> <span class="pl-en">createEvent</span>(<span class="pl-stj">Uri</span> <span class="pl-v">eventsUri</span>, <span class="pl-stj">String</span> <span class="pl-v">title</span>, <span class="pl-st">long</span> <span class="pl-v">startTime</span>, <span class="pl-st">long</span> <span class="pl-v">endTime</span>,</td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code js-file-line">                             <span class="pl-stj">String</span> <span class="pl-v">description</span>, <span class="pl-stj">String</span> <span class="pl-v">location</span>, <span class="pl-stj">Long</span> <span class="pl-v">firstReminderMinutes</span>, <span class="pl-stj">Long</span> <span class="pl-v">secondReminderMinutes</span>,</td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code js-file-line">                             <span class="pl-stj">String</span> <span class="pl-v">recurrence</span>, <span class="pl-stj">Long</span> <span class="pl-v">recurrenceEndTime</span>) {</td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code js-file-line">    eventsUri <span class="pl-k">=</span> eventsUri <span class="pl-k">==</span> <span class="pl-c1">null</span> <span class="pl-k">?</span> <span class="pl-stj">Uri</span><span class="pl-k">.</span>parse(<span class="pl-c1">CONTENT_PROVIDER_PRE_FROYO</span> <span class="pl-k">+</span> <span class="pl-c1">CONTENT_PROVIDER_PATH_EVENTS</span>) <span class="pl-k">:</span> eventsUri;</td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code js-file-line">    <span class="pl-v">super</span><span class="pl-k">.</span>createEvent(eventsUri, title, startTime, endTime, description, location,</td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code js-file-line">        firstReminderMinutes, secondReminderMinutes, recurrence, recurrenceEndTime);</td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code js-file-line">  }</td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code js-file-line">
</td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.07055s from github-fe121-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-d2f4f76d6a05f07ed67ef9f94d3823b34f98232770518bc7f8f40de8846ec511.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-2205ba936bc97f0feb06beea9b587efca7144fb60fed3601a636ae757d384cdd.js"></script>
      
      

  </body>
</html>

