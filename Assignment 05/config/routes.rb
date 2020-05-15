Rails.application.routes.draw do
  resources :cars_parts
  # route for cars search
  resources :cars do
    collection do
      get 'search'
    end
  end
  # route for makes search
  resources :makes do
    collection do
      get 'search'
    end
  end
  # route for parts search
  resources :parts do
    collection do
      get 'search'
    end
  end
  get '/', :to => redirect('/index.html') # Route root to SPA https://www.quora.com/How-can-you-set-a-static-page-lying-in-the-public-folder-of-the-app-as-the-root-page-which-is-seen-when-3000-is-accessed
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
