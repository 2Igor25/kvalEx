import { $authHost, $host } from "./index";
import jwt_decode from "jwt-decode";

export const createCategory = async (type) => {
  const { data } = await $authHost.post("api/category", type);
  return data;
};

export const fetchCategory = async () => {
  const { data } = await $host.get("api/category");
  return data;
};

export const createProduct = async (device) => {
  const { data } = await $authHost.post("api/product", device);
  return data;
};

export const fetchDevices = async (typeId, brandId, page, limit = 5) => {
  const { data } = await $host.get("api/product", {
    params: {
      typeId,
      brandId,
      page,
      limit,
    },
  });
  return data;
};

export const fetchOneProduct = async (id) => {
  const { data } = await $host.get("api/product/" + id);
  return data;
};
