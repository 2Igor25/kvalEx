import React, { useContext } from "react";
import { Routes, Roure, Navigate } from "react-router-dom";
import { authRoutes, publishRoutes } from "../routes";
import { Route } from "react-router-dom";
import { SHOP_ROUTE } from "../utils/consts";
import { Context } from "../index";

const AppRouter = () => {
  const { user } = useContext(Context);
  console.log(user.isAuth);
  return (
    <Routes>
      {user.IsAuth &&
        authRoutes.map(({ path, Component }) => {
          return <Route key={path} path={path} element={<Component />} exact />;
        })}

      {publishRoutes.map(({ path, Component }) => {
        return <Route key={path} path={path} element={<Component />} exact />;
      })}

      <Route path="*" element={<Navigate to={SHOP_ROUTE} />} />
    </Routes>
  );
};

export default AppRouter;
