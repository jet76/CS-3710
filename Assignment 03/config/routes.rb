Rails.application.routes.draw do
  get 'home/index'
  devise_for :users
  # route to home page
  root to: "home#index"
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
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
